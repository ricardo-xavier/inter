package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador253")
public class Somador253 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
