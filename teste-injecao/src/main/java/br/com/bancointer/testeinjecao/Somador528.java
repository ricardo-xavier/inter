package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador528")
public class Somador528 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
