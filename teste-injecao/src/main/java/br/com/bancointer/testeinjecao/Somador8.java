package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador8")
public class Somador8 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
