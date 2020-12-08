package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador540")
public class Somador540 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
