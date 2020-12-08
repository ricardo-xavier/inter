package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador884")
public class Somador884 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
