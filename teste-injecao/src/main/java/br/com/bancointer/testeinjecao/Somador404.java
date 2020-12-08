package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador404")
public class Somador404 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
