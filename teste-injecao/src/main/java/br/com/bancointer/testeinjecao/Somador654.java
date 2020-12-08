package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador654")
public class Somador654 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
