package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador44")
public class Somador44 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
