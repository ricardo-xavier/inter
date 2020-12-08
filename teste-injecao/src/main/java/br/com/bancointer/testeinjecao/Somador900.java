package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador900")
public class Somador900 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
