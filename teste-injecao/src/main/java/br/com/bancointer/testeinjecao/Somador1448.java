package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1448")
public class Somador1448 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
