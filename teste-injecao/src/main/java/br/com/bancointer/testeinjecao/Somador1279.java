package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1279")
public class Somador1279 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
