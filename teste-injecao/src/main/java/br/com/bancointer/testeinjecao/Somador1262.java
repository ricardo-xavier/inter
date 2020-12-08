package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1262")
public class Somador1262 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
