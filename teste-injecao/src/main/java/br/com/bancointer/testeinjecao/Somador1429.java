package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1429")
public class Somador1429 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
