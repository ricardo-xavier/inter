package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1867")
public class Somador1867 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
