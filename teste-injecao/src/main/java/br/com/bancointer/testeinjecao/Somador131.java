package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador131")
public class Somador131 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
