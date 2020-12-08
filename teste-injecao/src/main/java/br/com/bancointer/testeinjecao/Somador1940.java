package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1940")
public class Somador1940 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
