package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1951")
public class Somador1951 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
