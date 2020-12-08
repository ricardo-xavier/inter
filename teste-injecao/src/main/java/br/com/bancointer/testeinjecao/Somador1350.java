package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1350")
public class Somador1350 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
