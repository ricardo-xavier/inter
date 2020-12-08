package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1496")
public class Somador1496 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
