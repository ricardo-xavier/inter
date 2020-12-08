package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador831")
public class Somador831 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
