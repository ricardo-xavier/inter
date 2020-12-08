package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1502")
public class Somador1502 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
