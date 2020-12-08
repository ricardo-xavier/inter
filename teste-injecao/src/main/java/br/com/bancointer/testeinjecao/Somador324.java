package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador324")
public class Somador324 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
