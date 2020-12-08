package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador877")
public class Somador877 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
