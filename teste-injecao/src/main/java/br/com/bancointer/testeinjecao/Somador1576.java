package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1576")
public class Somador1576 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
