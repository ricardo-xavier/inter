package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador569")
public class Somador569 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
