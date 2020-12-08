package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1551")
public class Somador1551 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
