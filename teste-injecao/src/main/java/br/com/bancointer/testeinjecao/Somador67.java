package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador67")
public class Somador67 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
