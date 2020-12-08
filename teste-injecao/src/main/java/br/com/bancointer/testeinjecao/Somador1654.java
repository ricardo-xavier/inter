package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1654")
public class Somador1654 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
