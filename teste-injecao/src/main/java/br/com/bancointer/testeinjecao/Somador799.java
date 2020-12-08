package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador799")
public class Somador799 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
