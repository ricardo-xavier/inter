package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1458")
public class Somador1458 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
