package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1637")
public class Somador1637 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
