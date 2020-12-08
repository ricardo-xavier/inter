package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador925")
public class Somador925 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
