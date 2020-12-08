package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1642")
public class Somador1642 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
