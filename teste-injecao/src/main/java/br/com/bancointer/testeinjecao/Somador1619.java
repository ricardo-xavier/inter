package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1619")
public class Somador1619 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
