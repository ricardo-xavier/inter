package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador241")
public class Somador241 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
