package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador644")
public class Somador644 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
