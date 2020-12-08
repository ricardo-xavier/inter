package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador377")
public class Somador377 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
