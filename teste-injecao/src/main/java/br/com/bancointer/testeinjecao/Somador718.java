package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador718")
public class Somador718 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
