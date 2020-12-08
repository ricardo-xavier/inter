package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1731")
public class Somador1731 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
