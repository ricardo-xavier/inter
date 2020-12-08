package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1213")
public class Somador1213 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
