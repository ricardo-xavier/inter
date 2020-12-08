package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1594")
public class Somador1594 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
