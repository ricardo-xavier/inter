package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador218")
public class Somador218 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
