package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1994")
public class Somador1994 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
