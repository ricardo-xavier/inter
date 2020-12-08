package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador193")
public class Somador193 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
