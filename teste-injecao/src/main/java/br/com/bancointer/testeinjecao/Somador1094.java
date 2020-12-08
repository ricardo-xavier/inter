package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1094")
public class Somador1094 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
