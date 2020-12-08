package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1974")
public class Somador1974 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
