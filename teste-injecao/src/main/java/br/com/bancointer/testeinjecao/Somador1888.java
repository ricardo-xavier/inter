package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1888")
public class Somador1888 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
