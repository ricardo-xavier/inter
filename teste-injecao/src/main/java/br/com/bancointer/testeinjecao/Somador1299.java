package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1299")
public class Somador1299 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
