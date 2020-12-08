package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador674")
public class Somador674 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
