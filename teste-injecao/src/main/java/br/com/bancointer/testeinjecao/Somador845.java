package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador845")
public class Somador845 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
