package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador711")
public class Somador711 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
