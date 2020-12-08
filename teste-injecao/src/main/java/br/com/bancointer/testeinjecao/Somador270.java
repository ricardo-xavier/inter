package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador270")
public class Somador270 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
