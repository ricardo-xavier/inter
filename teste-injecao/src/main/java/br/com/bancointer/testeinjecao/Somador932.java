package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador932")
public class Somador932 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
