package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador519")
public class Somador519 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
