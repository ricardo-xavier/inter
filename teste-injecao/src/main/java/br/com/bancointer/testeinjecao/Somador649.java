package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador649")
public class Somador649 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
