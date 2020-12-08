package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador364")
public class Somador364 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
