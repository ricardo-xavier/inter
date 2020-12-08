package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1003")
public class Somador1003 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
