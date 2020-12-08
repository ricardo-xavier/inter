package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador140")
public class Somador140 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
