package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador394")
public class Somador394 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
