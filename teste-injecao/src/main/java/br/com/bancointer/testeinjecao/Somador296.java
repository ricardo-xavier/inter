package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador296")
public class Somador296 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
