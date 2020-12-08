package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador226")
public class Somador226 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
