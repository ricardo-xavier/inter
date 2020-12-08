package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1540")
public class Somador1540 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
