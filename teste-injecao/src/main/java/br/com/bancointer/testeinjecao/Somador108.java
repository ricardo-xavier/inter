package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador108")
public class Somador108 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
