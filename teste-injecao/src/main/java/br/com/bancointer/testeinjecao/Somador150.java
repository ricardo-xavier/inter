package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador150")
public class Somador150 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
