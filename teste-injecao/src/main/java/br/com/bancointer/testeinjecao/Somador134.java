package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador134")
public class Somador134 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
