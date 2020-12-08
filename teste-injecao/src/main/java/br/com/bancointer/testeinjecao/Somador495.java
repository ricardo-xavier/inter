package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador495")
public class Somador495 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
