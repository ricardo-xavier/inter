package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador392")
public class Somador392 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
