package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1610")
public class Somador1610 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
