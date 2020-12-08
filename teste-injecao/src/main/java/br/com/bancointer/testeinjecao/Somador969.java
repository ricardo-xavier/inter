package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador969")
public class Somador969 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
