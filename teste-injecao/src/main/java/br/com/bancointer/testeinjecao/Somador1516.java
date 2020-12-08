package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1516")
public class Somador1516 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
