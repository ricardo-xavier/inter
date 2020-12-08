package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1793")
public class Somador1793 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
