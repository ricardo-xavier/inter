package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador782")
public class Somador782 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
