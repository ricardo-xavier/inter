package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1142")
public class Somador1142 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
