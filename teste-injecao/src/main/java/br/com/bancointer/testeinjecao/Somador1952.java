package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1952")
public class Somador1952 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
