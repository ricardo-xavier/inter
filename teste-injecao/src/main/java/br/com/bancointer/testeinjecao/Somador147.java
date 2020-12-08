package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador147")
public class Somador147 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
