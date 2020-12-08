package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador379")
public class Somador379 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
