package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador923")
public class Somador923 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
