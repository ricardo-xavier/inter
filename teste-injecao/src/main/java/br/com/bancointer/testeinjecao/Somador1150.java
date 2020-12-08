package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1150")
public class Somador1150 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
