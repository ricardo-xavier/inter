package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1349")
public class Somador1349 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
