package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador349")
public class Somador349 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
