package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1010")
public class Somador1010 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
