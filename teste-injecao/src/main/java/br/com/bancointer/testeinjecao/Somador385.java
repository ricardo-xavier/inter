package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador385")
public class Somador385 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
