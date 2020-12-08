package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1392")
public class Somador1392 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
