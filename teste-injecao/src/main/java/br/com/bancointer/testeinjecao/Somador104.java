package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador104")
public class Somador104 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
