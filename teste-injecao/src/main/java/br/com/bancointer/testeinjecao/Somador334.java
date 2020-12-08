package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador334")
public class Somador334 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
