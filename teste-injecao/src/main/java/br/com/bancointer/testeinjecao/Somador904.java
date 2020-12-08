package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador904")
public class Somador904 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
