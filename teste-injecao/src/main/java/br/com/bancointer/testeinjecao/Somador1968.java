package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1968")
public class Somador1968 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
