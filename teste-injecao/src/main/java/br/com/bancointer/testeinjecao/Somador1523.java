package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1523")
public class Somador1523 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
