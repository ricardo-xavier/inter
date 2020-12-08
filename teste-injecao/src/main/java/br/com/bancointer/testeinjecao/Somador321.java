package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador321")
public class Somador321 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
