package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1270")
public class Somador1270 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
