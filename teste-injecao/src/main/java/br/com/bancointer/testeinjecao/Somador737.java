package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador737")
public class Somador737 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
