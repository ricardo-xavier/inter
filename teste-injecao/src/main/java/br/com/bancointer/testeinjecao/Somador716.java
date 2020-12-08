package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador716")
public class Somador716 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
