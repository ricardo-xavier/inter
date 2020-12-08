package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador95")
public class Somador95 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
