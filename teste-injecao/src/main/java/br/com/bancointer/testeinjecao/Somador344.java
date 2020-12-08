package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador344")
public class Somador344 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
