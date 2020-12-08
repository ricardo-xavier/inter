package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1176")
public class Somador1176 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
