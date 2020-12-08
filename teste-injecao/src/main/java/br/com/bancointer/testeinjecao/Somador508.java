package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador508")
public class Somador508 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
