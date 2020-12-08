package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1774")
public class Somador1774 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
