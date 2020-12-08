package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1640")
public class Somador1640 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
