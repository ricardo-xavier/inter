package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador175")
public class Somador175 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
