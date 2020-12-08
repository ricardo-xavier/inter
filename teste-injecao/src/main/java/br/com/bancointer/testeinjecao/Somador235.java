package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador235")
public class Somador235 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
