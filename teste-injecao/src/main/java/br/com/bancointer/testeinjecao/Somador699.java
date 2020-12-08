package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador699")
public class Somador699 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
