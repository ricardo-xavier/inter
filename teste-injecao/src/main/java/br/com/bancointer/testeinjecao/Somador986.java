package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador986")
public class Somador986 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
