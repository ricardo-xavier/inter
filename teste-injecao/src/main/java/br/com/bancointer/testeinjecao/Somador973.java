package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador973")
public class Somador973 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
