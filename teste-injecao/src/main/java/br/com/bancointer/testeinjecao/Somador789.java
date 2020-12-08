package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador789")
public class Somador789 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
