package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador706")
public class Somador706 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
