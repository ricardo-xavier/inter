package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador332")
public class Somador332 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
