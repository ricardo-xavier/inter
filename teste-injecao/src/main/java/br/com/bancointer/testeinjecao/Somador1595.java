package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1595")
public class Somador1595 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
