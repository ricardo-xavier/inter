package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador504")
public class Somador504 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
