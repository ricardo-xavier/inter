package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador650")
public class Somador650 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
