package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1438")
public class Somador1438 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
