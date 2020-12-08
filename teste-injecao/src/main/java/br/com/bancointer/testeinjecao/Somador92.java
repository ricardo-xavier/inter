package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador92")
public class Somador92 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
