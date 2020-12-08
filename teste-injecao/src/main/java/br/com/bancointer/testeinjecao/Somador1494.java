package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1494")
public class Somador1494 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
