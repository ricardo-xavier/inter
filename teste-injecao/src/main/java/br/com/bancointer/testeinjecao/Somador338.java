package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador338")
public class Somador338 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
