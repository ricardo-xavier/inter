package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador542")
public class Somador542 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
