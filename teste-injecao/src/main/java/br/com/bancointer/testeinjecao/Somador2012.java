package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2012")
public class Somador2012 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
