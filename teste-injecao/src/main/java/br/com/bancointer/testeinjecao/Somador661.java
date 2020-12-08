package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador661")
public class Somador661 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
