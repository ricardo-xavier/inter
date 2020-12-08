package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1054")
public class Somador1054 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
