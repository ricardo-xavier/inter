package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1556")
public class Somador1556 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
