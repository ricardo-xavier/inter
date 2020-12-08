package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1528")
public class Somador1528 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
