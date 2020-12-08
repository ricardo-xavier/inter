package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1356")
public class Somador1356 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
