package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador251")
public class Somador251 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
