package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1474")
public class Somador1474 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
