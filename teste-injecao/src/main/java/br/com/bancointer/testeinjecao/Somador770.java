package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador770")
public class Somador770 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
