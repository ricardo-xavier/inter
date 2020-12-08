package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1564")
public class Somador1564 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
