package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador999")
public class Somador999 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
