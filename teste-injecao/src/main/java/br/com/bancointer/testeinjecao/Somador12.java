package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador12")
public class Somador12 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
