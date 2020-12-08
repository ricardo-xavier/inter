package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador452")
public class Somador452 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
