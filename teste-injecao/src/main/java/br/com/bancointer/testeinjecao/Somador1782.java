package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1782")
public class Somador1782 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
