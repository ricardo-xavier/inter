package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador120")
public class Somador120 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
