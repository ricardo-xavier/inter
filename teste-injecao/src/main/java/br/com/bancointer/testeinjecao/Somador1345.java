package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1345")
public class Somador1345 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
