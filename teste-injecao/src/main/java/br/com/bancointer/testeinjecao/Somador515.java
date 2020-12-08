package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador515")
public class Somador515 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
