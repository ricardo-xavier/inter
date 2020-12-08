package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador595")
public class Somador595 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
