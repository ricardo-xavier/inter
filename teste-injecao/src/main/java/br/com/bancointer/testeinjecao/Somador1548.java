package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1548")
public class Somador1548 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
