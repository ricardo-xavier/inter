package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1123")
public class Somador1123 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
