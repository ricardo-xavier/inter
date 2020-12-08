package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1682")
public class Somador1682 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
