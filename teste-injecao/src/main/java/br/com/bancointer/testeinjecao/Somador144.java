package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador144")
public class Somador144 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
