package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1272")
public class Somador1272 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
