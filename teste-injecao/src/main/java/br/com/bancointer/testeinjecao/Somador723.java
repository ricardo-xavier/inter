package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador723")
public class Somador723 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
