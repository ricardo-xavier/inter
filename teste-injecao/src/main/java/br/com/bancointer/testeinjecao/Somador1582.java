package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1582")
public class Somador1582 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
