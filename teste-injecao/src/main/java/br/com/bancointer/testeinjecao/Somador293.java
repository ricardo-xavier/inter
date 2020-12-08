package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador293")
public class Somador293 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
