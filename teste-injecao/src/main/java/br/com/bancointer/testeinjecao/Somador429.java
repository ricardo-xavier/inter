package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador429")
public class Somador429 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
