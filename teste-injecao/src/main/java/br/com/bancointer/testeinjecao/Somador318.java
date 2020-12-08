package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador318")
public class Somador318 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
