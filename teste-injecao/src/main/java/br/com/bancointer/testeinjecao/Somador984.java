package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador984")
public class Somador984 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
