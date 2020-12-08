package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador342")
public class Somador342 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
