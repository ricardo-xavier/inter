package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador731")
public class Somador731 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
