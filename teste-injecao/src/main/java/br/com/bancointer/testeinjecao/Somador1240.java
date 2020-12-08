package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1240")
public class Somador1240 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
