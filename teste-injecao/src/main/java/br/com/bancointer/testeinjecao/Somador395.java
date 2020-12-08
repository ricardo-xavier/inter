package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador395")
public class Somador395 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
