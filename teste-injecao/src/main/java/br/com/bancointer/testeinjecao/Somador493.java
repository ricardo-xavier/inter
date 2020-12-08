package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador493")
public class Somador493 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
