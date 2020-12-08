package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador283")
public class Somador283 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
