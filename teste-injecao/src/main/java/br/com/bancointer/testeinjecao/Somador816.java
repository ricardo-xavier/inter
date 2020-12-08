package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador816")
public class Somador816 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
