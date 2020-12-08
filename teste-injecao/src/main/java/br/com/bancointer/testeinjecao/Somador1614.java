package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1614")
public class Somador1614 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
