package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1521")
public class Somador1521 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
