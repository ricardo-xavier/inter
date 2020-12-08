package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1980")
public class Somador1980 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
