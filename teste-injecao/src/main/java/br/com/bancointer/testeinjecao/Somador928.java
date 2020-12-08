package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador928")
public class Somador928 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
