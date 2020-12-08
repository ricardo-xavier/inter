package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1545")
public class Somador1545 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
