package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador242")
public class Somador242 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
