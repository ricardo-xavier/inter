package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador100")
public class Somador100 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
