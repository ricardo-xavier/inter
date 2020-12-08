package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador560")
public class Somador560 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
