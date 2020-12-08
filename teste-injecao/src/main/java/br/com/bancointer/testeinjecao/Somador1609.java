package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1609")
public class Somador1609 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
