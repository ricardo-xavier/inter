package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1293")
public class Somador1293 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
