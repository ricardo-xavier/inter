package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1618")
public class Somador1618 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
