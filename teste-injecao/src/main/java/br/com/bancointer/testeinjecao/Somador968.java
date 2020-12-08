package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador968")
public class Somador968 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
