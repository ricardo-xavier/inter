package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1969")
public class Somador1969 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
