package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador278")
public class Somador278 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
