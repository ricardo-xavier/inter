package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador662")
public class Somador662 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
