package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1769")
public class Somador1769 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
