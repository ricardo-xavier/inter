package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador204")
public class Somador204 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
