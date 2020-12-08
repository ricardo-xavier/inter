package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1355")
public class Somador1355 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
