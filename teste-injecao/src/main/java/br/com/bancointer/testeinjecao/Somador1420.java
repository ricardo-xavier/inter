package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1420")
public class Somador1420 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
