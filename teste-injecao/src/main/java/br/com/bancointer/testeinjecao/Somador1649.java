package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1649")
public class Somador1649 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
