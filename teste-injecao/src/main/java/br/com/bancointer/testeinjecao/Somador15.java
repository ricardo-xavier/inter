package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador15")
public class Somador15 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
