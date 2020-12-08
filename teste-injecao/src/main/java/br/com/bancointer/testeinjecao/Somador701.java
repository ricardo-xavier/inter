package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador701")
public class Somador701 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
