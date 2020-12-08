package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador974")
public class Somador974 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
