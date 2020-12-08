package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador614")
public class Somador614 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
