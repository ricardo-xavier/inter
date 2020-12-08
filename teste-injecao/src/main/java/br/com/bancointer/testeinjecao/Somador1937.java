package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1937")
public class Somador1937 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
