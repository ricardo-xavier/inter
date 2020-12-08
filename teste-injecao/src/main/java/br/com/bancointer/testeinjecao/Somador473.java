package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador473")
public class Somador473 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
