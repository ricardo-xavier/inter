package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1070")
public class Somador1070 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
