package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador181")
public class Somador181 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
