package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2020")
public class Somador2020 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
