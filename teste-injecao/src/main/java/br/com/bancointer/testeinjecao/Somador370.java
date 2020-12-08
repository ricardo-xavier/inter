package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador370")
public class Somador370 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
