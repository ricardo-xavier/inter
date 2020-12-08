package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador697")
public class Somador697 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
