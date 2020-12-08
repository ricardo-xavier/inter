package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador368")
public class Somador368 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
