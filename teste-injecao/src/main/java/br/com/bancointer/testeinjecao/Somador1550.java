package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1550")
public class Somador1550 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
