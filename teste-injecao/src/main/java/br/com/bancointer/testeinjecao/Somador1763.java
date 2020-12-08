package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1763")
public class Somador1763 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
