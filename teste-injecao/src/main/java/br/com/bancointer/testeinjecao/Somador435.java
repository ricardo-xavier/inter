package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador435")
public class Somador435 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
