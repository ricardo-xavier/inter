package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1765")
public class Somador1765 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
