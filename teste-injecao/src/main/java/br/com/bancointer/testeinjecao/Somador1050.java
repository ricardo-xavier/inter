package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1050")
public class Somador1050 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
