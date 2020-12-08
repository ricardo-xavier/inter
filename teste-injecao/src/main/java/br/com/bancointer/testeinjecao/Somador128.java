package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador128")
public class Somador128 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
