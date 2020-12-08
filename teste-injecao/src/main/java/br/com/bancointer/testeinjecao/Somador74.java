package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador74")
public class Somador74 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
