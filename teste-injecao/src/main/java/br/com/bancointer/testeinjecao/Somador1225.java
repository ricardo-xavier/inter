package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1225")
public class Somador1225 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
