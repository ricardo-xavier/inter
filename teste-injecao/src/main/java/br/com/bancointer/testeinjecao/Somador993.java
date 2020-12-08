package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador993")
public class Somador993 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
