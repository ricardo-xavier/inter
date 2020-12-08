package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador538")
public class Somador538 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
