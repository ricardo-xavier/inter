package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador746")
public class Somador746 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
