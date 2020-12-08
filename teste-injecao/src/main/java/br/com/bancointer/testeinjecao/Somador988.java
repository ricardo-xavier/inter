package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador988")
public class Somador988 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
