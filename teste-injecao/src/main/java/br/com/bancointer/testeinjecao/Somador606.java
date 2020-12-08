package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador606")
public class Somador606 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
