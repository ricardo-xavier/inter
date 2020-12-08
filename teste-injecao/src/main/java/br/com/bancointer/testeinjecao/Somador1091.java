package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1091")
public class Somador1091 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
