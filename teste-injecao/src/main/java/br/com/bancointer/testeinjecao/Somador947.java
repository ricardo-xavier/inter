package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador947")
public class Somador947 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
