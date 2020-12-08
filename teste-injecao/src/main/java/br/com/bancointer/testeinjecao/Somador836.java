package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador836")
public class Somador836 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
