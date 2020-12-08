package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador3")
public class Somador3 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
