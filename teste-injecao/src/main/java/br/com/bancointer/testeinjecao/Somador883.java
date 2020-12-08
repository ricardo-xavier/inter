package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador883")
public class Somador883 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
