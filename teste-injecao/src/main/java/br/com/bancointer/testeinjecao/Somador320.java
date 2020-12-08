package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador320")
public class Somador320 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
