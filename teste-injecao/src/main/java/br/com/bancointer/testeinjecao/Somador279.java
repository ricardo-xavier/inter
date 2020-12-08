package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador279")
public class Somador279 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
