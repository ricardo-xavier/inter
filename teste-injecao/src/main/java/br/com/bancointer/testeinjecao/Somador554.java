package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador554")
public class Somador554 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
