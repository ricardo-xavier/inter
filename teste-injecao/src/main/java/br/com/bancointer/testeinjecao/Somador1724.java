package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1724")
public class Somador1724 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
