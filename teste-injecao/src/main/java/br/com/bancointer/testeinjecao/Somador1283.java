package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1283")
public class Somador1283 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
