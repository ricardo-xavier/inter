package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador417")
public class Somador417 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
