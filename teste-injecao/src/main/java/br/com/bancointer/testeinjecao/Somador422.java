package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador422")
public class Somador422 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
