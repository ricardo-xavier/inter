package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador648")
public class Somador648 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
