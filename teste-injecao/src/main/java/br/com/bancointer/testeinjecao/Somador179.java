package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador179")
public class Somador179 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
