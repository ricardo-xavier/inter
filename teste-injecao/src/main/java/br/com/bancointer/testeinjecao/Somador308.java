package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador308")
public class Somador308 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
