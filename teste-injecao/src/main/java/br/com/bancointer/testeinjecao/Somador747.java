package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador747")
public class Somador747 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
