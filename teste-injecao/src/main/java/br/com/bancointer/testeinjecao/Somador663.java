package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador663")
public class Somador663 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
