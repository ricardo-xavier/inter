package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador842")
public class Somador842 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
