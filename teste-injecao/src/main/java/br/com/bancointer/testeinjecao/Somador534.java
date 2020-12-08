package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador534")
public class Somador534 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
