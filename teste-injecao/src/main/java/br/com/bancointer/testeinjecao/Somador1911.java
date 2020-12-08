package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1911")
public class Somador1911 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
