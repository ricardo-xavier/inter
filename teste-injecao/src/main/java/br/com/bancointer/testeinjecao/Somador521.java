package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador521")
public class Somador521 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
