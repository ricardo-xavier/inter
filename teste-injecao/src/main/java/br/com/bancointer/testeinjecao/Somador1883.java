package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1883")
public class Somador1883 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
