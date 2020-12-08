package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1727")
public class Somador1727 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
