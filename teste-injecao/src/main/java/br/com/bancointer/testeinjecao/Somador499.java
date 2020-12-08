package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador499")
public class Somador499 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
