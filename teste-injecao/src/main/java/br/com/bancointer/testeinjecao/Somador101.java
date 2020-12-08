package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador101")
public class Somador101 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
