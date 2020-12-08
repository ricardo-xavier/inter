package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador970")
public class Somador970 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
