package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador458")
public class Somador458 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
