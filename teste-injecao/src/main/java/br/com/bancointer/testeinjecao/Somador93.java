package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador93")
public class Somador93 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
