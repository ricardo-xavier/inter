package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1172")
public class Somador1172 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
