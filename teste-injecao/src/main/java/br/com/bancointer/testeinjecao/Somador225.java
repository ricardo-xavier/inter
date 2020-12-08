package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador225")
public class Somador225 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
