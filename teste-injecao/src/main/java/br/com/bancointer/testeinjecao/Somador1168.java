package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1168")
public class Somador1168 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
