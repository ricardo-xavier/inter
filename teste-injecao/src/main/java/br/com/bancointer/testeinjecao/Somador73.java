package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador73")
public class Somador73 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
