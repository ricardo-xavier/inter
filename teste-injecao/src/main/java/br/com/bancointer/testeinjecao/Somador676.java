package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador676")
public class Somador676 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
