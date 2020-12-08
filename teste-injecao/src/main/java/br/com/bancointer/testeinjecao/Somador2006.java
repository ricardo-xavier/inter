package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2006")
public class Somador2006 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
