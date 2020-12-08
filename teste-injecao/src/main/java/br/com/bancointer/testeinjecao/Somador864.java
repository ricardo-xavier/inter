package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador864")
public class Somador864 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
