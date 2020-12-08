package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador136")
public class Somador136 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
