package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador38")
public class Somador38 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
