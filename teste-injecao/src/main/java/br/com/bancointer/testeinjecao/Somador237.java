package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador237")
public class Somador237 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
