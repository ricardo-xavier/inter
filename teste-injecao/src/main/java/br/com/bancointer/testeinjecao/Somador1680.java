package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1680")
public class Somador1680 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
