package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2015")
public class Somador2015 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
