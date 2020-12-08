package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1583")
public class Somador1583 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
