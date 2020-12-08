package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador29")
public class Somador29 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
