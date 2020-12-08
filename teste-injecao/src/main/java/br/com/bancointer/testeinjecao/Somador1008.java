package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1008")
public class Somador1008 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
