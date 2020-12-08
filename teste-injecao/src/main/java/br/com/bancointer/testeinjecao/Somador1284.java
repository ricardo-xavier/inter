package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1284")
public class Somador1284 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
