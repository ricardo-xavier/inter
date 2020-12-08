package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1364")
public class Somador1364 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
