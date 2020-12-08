package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2008")
public class Somador2008 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
