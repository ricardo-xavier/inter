package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador530")
public class Somador530 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
