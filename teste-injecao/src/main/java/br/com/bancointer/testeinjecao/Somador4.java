package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador4")
public class Somador4 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
