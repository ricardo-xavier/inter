package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador961")
public class Somador961 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
