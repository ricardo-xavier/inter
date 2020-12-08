package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1989")
public class Somador1989 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
