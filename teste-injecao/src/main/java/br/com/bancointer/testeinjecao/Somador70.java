package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador70")
public class Somador70 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
