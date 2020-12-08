package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador941")
public class Somador941 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
