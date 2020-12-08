package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador994")
public class Somador994 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
