package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1585")
public class Somador1585 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
