package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador49")
public class Somador49 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
