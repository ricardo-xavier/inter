package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1093")
public class Somador1093 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
