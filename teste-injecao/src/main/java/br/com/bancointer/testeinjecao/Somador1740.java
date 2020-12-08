package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1740")
public class Somador1740 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
