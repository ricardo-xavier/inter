package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador391")
public class Somador391 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
