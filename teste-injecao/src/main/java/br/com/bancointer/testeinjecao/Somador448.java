package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador448")
public class Somador448 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
