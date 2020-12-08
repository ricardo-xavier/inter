package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador574")
public class Somador574 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
