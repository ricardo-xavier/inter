package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador657")
public class Somador657 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
