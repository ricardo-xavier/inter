package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador967")
public class Somador967 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
