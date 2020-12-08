package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1333")
public class Somador1333 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
