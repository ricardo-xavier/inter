package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1681")
public class Somador1681 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
