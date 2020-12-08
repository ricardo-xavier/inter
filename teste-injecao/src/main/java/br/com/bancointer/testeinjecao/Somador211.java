package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador211")
public class Somador211 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
