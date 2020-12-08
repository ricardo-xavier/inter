package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1630")
public class Somador1630 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
