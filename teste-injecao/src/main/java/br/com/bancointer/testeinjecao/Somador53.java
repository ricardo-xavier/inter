package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador53")
public class Somador53 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
