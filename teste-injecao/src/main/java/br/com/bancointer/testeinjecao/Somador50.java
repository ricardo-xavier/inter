package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador50")
public class Somador50 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
