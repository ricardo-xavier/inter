package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1600")
public class Somador1600 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
