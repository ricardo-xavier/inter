package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1374")
public class Somador1374 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
