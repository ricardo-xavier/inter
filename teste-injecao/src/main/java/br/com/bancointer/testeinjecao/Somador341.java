package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador341")
public class Somador341 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
