package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1047")
public class Somador1047 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
