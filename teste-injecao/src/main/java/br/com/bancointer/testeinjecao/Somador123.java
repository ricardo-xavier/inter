package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador123")
public class Somador123 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
