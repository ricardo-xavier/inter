package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador350")
public class Somador350 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
