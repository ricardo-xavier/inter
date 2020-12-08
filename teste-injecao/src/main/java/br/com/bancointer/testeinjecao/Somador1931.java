package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1931")
public class Somador1931 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
