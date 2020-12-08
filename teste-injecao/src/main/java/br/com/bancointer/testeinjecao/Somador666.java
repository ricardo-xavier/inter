package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador666")
public class Somador666 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
