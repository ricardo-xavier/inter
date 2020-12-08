package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1689")
public class Somador1689 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
