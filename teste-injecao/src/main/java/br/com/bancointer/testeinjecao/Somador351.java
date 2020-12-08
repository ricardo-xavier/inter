package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador351")
public class Somador351 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
