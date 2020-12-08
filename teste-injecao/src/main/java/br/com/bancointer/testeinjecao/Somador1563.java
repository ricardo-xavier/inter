package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1563")
public class Somador1563 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
