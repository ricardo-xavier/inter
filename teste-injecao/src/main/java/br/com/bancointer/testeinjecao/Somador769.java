package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador769")
public class Somador769 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
