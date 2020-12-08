package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1461")
public class Somador1461 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
