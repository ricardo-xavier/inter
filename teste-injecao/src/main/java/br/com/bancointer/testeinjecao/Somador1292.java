package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1292")
public class Somador1292 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
