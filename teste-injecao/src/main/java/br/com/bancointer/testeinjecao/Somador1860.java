package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1860")
public class Somador1860 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
