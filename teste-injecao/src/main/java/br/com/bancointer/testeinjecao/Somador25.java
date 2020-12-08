package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador25")
public class Somador25 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
