package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1126")
public class Somador1126 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
