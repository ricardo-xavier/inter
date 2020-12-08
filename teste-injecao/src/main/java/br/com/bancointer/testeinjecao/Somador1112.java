package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1112")
public class Somador1112 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
