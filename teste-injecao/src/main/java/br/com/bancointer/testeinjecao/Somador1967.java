package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1967")
public class Somador1967 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
