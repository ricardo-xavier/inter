package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1720")
public class Somador1720 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
