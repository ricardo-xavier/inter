package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1870")
public class Somador1870 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
