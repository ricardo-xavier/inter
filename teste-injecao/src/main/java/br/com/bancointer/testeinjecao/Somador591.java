package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador591")
public class Somador591 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
