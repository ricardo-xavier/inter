package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador124")
public class Somador124 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
