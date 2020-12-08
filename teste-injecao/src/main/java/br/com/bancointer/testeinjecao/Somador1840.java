package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1840")
public class Somador1840 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
