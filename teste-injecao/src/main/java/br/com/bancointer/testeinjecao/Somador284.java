package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador284")
public class Somador284 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
