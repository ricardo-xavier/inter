package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2007")
public class Somador2007 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
