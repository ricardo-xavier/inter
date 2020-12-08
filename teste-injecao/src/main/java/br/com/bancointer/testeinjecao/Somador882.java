package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador882")
public class Somador882 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
