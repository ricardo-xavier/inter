package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1014")
public class Somador1014 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
