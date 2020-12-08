package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador220")
public class Somador220 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
