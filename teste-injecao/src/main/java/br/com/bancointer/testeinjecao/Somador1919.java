package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1919")
public class Somador1919 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
