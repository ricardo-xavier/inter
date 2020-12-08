package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador272")
public class Somador272 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
