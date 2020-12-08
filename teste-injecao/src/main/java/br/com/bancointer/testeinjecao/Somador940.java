package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador940")
public class Somador940 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
