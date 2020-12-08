package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1729")
public class Somador1729 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
