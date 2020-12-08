package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1368")
public class Somador1368 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
