package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1648")
public class Somador1648 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
