package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1711")
public class Somador1711 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
