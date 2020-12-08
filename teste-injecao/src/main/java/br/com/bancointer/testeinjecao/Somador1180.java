package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1180")
public class Somador1180 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
