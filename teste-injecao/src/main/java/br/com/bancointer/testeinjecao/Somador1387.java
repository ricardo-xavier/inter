package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1387")
public class Somador1387 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
