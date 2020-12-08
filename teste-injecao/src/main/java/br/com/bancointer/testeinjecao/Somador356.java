package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador356")
public class Somador356 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
