package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador64")
public class Somador64 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
