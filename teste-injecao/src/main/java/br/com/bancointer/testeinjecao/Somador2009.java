package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2009")
public class Somador2009 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
