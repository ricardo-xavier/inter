package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1533")
public class Somador1533 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
