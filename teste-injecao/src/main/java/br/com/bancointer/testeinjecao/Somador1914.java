package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1914")
public class Somador1914 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
