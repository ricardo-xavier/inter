package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador527")
public class Somador527 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
