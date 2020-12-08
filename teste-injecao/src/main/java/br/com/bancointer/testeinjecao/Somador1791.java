package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1791")
public class Somador1791 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
