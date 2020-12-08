package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador689")
public class Somador689 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
