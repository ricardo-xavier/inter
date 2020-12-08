package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1960")
public class Somador1960 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
