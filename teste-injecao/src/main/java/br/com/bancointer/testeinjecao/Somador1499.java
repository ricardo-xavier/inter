package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1499")
public class Somador1499 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
