package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1734")
public class Somador1734 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
