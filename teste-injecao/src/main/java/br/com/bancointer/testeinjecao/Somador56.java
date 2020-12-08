package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador56")
public class Somador56 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
