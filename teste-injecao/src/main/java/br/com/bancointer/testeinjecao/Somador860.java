package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador860")
public class Somador860 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
