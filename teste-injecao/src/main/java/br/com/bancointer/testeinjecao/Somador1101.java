package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1101")
public class Somador1101 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
