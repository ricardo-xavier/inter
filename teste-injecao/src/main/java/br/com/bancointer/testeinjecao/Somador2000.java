package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2000")
public class Somador2000 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
