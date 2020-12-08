package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1961")
public class Somador1961 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
