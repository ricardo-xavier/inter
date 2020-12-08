package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador762")
public class Somador762 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
