package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1612")
public class Somador1612 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
