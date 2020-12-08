package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador834")
public class Somador834 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
