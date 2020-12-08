package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1273")
public class Somador1273 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
