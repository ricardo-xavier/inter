package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1572")
public class Somador1572 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
