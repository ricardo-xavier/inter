package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1554")
public class Somador1554 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
