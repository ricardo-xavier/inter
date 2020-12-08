package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1498")
public class Somador1498 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
