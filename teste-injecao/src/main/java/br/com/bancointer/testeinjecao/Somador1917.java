package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1917")
public class Somador1917 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
