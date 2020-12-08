package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador911")
public class Somador911 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
