package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador402")
public class Somador402 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
