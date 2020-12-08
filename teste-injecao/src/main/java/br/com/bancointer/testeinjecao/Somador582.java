package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador582")
public class Somador582 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
