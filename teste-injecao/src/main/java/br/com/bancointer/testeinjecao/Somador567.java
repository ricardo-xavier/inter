package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador567")
public class Somador567 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
