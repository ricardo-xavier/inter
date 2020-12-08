package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1673")
public class Somador1673 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
