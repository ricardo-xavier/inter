package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1478")
public class Somador1478 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
