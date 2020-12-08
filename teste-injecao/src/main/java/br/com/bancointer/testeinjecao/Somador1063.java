package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1063")
public class Somador1063 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
