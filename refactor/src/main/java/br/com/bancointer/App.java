package br.com.bancointer;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class App {

    private static Map<String, List<String>> qualifiersMap = new HashMap<>();
    private static Map<String, String> componentsMap = new HashMap<>();
    private static String pkg;

    public static void main( String[] args ) throws Exception {

        // verifica se eh um diretorio de um projeto maven
        if (!new File("pom.xml").exists()) {
            System.out.println("pom.xml nao encontrado");
            return;
        }
        if (!new File("src").exists()) {
            System.out.println("src nao encontrado");
            return;
        }

        find("src");
        for (String file : qualifiersMap.keySet()) {
            refactor(file, qualifiersMap.get(file));
        }
    }

    private static void refactor(String file, List<String> qualifiers) throws Exception {
        System.out.println(file);
        for (String qualifier : qualifiers) {
            String component = componentsMap.get(qualifier);
            if (component == null) {
                throw new Exception("component not found: " + qualifier);
            }
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        PrintWriter writer = new PrintWriter(file + ".tmp");
        String line;

        while ((line = reader.readLine()) != null) {

            if (line.contains("@Autowired")) {
                line = reader.readLine();
                if (line.contains("@Qualifier")) {
                    String[] split = line.split("\"");
                    if (split.length == 3) {
                        String component = componentsMap.get(split[1]);
                        String replace = reader.readLine();
                        line = replace.replace(";", " = new "
                            + component + "();");
                    } else {
                        writer.println("@Autowired");
                        writer.println(line);
                    }
                } else {
                    writer.println("@Autowired");
                }
            }

            //FIXME
            if (line.contains("Feliz")) {
                line = line.replace("Feliz", "FELIZ");
            }

            writer.println(line);
        }

        writer.close();
        reader.close();

        String bkp = file + ".bkp";
        new File(file).renameTo(new File(bkp));
        String tmp = file + ".tmp";
        new File(tmp).renameTo(new File(file));

    }

    private static void find(String dir) throws IOException {

        File[] files = new File(dir).listFiles();
        if (files == null) {
            return;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                find(file.getPath());
            } else {
                if (file.getName().endsWith(".java")) {
                    verify(file);
                }
            }
        }
    }

    private static void verify(File file) throws IOException {

        List<String> qualifiers = new ArrayList<>();
        List<String> components = new ArrayList<>();

        Consumer<? super String> grep = line -> {

            if (line.contains("@Qualifier")) {
                String[] split = line.split("\"");
                if (split.length == 3) {
                    qualifiers.add(split[1]);
                }
            } else if (line.contains("@Component")) {
                String[] split = line.split("\"");
                if (split.length == 3) {
                    components.add(split[1]);
                }
            } else if (line.startsWith("package")) {
                pkg = line.substring(8).replace(";", "").trim();
            }
        };

        Files.lines(file.toPath()).forEach(grep);
        if (qualifiers.size() > 0) {
            qualifiersMap.put(file.getPath(), qualifiers);
        }
        for (String component : components) {
            componentsMap.put(component, pkg + "." + file.getName().replace(".java", ""));
        }
    }
}
