package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1426")
public class Somador1426 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
