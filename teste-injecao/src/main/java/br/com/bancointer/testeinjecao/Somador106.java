package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador106")
public class Somador106 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
