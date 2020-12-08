package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1599")
public class Somador1599 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
