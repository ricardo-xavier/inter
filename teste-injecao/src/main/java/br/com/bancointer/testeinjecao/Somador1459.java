package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1459")
public class Somador1459 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
