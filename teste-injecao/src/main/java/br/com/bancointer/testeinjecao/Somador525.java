package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador525")
public class Somador525 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
