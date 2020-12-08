package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador110")
public class Somador110 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
