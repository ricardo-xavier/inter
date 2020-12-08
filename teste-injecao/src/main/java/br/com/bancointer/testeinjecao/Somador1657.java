package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1657")
public class Somador1657 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
