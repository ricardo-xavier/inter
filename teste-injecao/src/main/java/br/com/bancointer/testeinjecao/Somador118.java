package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador118")
public class Somador118 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
