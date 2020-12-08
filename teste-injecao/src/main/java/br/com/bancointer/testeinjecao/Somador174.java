package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador174")
public class Somador174 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
