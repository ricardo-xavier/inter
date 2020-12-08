package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1990")
public class Somador1990 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
