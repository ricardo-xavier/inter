package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1904")
public class Somador1904 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
