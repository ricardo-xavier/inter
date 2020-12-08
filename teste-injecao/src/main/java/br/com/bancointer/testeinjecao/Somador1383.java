package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1383")
public class Somador1383 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
