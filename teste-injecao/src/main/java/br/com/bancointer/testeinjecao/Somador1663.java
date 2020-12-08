package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1663")
public class Somador1663 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
