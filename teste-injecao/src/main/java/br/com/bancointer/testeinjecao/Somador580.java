package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador580")
public class Somador580 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
