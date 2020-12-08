package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador9")
public class Somador9 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
