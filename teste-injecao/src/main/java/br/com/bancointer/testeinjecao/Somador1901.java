package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1901")
public class Somador1901 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
