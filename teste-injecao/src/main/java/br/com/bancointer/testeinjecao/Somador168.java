package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador168")
public class Somador168 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
