package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador207")
public class Somador207 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
