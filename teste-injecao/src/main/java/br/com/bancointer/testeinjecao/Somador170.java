package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador170")
public class Somador170 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
