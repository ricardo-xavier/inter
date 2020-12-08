package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador330")
public class Somador330 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
