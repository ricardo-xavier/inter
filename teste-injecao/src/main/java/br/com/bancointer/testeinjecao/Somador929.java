package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador929")
public class Somador929 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
