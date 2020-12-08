package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador909")
public class Somador909 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
