package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1905")
public class Somador1905 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
