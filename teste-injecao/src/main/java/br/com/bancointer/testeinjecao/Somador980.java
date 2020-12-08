package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador980")
public class Somador980 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
