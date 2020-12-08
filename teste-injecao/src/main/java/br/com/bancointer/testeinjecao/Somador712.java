package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador712")
public class Somador712 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
