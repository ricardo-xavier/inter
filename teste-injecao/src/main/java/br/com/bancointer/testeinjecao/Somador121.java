package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador121")
public class Somador121 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
