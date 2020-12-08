package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador824")
public class Somador824 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
