package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador647")
public class Somador647 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
