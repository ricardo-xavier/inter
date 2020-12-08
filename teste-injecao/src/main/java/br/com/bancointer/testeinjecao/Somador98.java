package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador98")
public class Somador98 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
