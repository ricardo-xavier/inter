package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador438")
public class Somador438 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
