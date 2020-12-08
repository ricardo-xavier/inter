package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador896")
public class Somador896 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
