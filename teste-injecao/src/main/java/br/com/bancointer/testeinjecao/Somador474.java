package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador474")
public class Somador474 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
