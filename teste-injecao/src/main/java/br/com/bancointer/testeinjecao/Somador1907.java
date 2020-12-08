package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1907")
public class Somador1907 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
