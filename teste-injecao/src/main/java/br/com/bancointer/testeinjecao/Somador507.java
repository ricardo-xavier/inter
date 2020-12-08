package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador507")
public class Somador507 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
