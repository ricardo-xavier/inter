package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador872")
public class Somador872 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
