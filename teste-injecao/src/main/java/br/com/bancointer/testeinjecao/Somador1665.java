package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1665")
public class Somador1665 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
