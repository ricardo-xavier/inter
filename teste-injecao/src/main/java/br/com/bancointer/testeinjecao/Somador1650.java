package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1650")
public class Somador1650 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
