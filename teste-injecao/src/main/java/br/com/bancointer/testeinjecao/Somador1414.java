package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1414")
public class Somador1414 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
