package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador430")
public class Somador430 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
