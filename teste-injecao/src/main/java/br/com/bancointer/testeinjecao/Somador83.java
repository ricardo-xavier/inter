package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador83")
public class Somador83 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
