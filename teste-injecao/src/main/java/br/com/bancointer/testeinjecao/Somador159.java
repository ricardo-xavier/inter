package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador159")
public class Somador159 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
