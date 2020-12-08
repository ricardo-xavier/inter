package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador756")
public class Somador756 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
