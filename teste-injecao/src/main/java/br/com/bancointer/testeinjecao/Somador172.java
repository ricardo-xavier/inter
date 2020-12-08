package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador172")
public class Somador172 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
