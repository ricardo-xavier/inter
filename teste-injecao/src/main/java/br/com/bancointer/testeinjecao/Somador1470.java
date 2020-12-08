package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1470")
public class Somador1470 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
