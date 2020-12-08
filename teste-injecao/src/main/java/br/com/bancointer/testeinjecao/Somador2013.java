package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2013")
public class Somador2013 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
