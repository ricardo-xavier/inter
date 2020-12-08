package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador16")
public class Somador16 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
