package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador245")
public class Somador245 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
