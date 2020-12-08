package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador405")
public class Somador405 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
