package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1695")
public class Somador1695 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
