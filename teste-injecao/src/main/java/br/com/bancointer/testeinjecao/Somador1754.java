package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1754")
public class Somador1754 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
