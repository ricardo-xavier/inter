package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1338")
public class Somador1338 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
