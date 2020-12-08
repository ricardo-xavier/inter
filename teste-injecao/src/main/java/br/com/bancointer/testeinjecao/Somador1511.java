package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1511")
public class Somador1511 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
