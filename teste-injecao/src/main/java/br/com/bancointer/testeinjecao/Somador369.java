package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador369")
public class Somador369 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
