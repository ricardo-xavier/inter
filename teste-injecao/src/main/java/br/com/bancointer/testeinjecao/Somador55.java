package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador55")
public class Somador55 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
