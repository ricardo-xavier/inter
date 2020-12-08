package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1862")
public class Somador1862 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
