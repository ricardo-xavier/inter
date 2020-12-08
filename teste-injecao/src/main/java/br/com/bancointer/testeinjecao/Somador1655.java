package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1655")
public class Somador1655 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
