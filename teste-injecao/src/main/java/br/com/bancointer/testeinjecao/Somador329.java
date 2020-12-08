package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador329")
public class Somador329 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
