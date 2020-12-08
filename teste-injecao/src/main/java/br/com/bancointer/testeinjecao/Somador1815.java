package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1815")
public class Somador1815 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
