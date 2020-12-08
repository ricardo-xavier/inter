package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador113")
public class Somador113 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
