package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1972")
public class Somador1972 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
