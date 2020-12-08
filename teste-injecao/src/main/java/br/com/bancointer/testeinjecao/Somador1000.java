package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1000")
public class Somador1000 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
