package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador348")
public class Somador348 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
