package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1700")
public class Somador1700 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
