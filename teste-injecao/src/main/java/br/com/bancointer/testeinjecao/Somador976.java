package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador976")
public class Somador976 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
