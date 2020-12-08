package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1431")
public class Somador1431 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
