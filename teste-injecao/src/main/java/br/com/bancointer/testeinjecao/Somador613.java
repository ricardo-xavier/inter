package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador613")
public class Somador613 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
