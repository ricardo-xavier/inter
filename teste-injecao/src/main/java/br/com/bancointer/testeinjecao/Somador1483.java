package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1483")
public class Somador1483 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
