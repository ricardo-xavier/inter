package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1589")
public class Somador1589 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
