package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador658")
public class Somador658 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
