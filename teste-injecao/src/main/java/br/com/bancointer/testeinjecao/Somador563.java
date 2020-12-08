package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador563")
public class Somador563 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
