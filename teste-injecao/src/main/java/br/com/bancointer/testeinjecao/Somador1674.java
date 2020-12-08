package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1674")
public class Somador1674 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
