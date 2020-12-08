package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador357")
public class Somador357 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
