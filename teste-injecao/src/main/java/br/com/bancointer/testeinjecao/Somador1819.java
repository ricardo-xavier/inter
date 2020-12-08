package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1819")
public class Somador1819 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
