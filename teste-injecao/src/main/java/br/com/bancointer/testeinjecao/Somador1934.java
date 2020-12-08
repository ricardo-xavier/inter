package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1934")
public class Somador1934 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
