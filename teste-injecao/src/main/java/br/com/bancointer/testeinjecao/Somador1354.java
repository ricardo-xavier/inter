package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1354")
public class Somador1354 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
