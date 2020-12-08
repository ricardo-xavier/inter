package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1626")
public class Somador1626 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
