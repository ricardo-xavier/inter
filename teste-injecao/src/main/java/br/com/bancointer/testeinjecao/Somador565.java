package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador565")
public class Somador565 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
