package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador609")
public class Somador609 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
