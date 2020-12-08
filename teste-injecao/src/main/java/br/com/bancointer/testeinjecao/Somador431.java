package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador431")
public class Somador431 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
