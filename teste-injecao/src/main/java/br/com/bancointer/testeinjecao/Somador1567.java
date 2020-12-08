package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1567")
public class Somador1567 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
