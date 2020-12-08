package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador36")
public class Somador36 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
