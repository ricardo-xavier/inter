package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador605")
public class Somador605 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
