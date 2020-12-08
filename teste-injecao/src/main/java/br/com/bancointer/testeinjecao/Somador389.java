package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador389")
public class Somador389 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
