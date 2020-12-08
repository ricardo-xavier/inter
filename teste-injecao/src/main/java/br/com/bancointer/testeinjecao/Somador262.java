package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador262")
public class Somador262 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
