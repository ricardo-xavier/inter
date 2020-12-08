package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1140")
public class Somador1140 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
