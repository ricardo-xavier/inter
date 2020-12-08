package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador304")
public class Somador304 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
