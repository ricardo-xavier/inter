package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador125")
public class Somador125 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
