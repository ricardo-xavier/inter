package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador137")
public class Somador137 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
