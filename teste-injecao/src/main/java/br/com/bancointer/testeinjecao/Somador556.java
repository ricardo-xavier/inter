package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador556")
public class Somador556 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
