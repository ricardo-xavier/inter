package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1628")
public class Somador1628 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
