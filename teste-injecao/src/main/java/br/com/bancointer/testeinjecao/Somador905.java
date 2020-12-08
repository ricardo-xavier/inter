package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador905")
public class Somador905 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
