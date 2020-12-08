package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador10")
public class Somador10 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
