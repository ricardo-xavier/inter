package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1976")
public class Somador1976 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
