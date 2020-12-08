package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador511")
public class Somador511 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
