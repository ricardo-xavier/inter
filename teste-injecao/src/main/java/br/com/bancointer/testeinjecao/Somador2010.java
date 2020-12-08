package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2010")
public class Somador2010 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
