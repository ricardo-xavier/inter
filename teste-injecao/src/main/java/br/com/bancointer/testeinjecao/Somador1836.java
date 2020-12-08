package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1836")
public class Somador1836 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
