package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1982")
public class Somador1982 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
