package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador180")
public class Somador180 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
