package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador126")
public class Somador126 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
