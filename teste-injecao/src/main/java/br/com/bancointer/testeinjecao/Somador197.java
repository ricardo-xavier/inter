package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador197")
public class Somador197 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
