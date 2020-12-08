package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador18")
public class Somador18 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
