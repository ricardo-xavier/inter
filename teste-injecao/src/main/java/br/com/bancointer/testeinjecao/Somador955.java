package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador955")
public class Somador955 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
