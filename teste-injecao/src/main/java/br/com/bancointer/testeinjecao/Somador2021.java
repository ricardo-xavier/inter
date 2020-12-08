package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2021")
public class Somador2021 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
