package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1165")
public class Somador1165 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
