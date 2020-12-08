package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1510")
public class Somador1510 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
