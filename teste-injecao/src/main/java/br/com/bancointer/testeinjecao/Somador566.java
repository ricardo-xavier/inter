package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador566")
public class Somador566 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
