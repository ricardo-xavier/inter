package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador141")
public class Somador141 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
