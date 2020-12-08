package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1864")
public class Somador1864 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
