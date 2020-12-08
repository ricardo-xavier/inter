package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1406")
public class Somador1406 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
