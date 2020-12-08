package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador433")
public class Somador433 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
