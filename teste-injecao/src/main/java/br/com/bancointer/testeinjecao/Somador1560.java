package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1560")
public class Somador1560 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
