package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador749")
public class Somador749 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
