package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador451")
public class Somador451 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
