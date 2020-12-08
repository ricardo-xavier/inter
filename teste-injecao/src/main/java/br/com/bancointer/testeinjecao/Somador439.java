package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador439")
public class Somador439 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
