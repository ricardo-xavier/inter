package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador581")
public class Somador581 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
