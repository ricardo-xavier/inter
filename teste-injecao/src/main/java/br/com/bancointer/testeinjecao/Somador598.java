package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador598")
public class Somador598 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
