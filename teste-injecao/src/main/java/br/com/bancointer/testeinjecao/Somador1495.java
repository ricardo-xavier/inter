package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1495")
public class Somador1495 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
