package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador255")
public class Somador255 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
