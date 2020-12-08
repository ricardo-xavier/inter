package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1021")
public class Somador1021 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
