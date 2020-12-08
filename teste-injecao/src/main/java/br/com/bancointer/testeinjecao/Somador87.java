package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador87")
public class Somador87 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
