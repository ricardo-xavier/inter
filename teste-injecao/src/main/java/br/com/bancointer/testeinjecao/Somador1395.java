package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1395")
public class Somador1395 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
