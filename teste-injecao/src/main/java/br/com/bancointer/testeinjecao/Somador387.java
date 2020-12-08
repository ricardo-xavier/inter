package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador387")
public class Somador387 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
