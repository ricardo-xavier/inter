package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1515")
public class Somador1515 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
