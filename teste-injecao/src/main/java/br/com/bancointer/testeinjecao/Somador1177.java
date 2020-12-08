package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1177")
public class Somador1177 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
