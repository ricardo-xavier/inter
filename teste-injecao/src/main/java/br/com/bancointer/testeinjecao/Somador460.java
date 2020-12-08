package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador460")
public class Somador460 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
