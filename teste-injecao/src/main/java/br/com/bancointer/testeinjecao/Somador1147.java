package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1147")
public class Somador1147 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
