package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador548")
public class Somador548 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
