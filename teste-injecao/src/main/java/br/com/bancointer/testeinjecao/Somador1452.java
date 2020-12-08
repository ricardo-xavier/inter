package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1452")
public class Somador1452 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
