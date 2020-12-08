package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador161")
public class Somador161 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
