package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1598")
public class Somador1598 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
