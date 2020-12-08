package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador584")
public class Somador584 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
