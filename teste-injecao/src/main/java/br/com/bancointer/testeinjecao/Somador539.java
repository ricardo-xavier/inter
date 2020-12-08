package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador539")
public class Somador539 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
