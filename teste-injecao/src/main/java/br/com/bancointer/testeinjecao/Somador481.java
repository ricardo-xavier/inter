package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador481")
public class Somador481 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
