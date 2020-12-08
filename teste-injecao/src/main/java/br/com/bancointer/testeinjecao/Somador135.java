package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador135")
public class Somador135 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
