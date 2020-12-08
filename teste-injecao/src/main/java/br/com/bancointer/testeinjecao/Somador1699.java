package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1699")
public class Somador1699 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
