package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1532")
public class Somador1532 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
