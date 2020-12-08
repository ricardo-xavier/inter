package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1399")
public class Somador1399 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
