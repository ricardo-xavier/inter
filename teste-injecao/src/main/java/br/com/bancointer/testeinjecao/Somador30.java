package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador30")
public class Somador30 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
