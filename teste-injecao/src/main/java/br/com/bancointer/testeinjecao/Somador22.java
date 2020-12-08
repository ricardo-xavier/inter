package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador22")
public class Somador22 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
