package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador267")
public class Somador267 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
