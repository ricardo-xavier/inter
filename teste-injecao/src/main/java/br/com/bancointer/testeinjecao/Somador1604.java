package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1604")
public class Somador1604 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
