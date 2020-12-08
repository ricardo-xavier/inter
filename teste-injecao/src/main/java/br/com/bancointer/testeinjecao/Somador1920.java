package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1920")
public class Somador1920 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
