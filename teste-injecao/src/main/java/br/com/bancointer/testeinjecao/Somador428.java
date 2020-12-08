package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador428")
public class Somador428 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
