package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1955")
public class Somador1955 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
