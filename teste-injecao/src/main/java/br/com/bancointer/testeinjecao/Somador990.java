package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador990")
public class Somador990 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
