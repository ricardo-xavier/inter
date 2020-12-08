package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1453")
public class Somador1453 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
