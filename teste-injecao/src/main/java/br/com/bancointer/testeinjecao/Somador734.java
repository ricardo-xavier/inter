package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador734")
public class Somador734 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
