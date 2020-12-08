package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1798")
public class Somador1798 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
