package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2001")
public class Somador2001 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
