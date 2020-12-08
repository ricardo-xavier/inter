package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1471")
public class Somador1471 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
