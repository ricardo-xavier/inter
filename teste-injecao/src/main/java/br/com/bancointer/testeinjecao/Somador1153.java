package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1153")
public class Somador1153 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
