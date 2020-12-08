package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1538")
public class Somador1538 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
