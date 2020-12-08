package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador496")
public class Somador496 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
