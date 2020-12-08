package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador612")
public class Somador612 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
