package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1344")
public class Somador1344 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
