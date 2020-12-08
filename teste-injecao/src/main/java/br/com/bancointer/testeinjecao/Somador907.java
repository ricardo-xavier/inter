package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador907")
public class Somador907 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
