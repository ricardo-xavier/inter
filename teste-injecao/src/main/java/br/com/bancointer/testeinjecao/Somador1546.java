package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1546")
public class Somador1546 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
