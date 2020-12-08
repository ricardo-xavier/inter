package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador919")
public class Somador919 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
