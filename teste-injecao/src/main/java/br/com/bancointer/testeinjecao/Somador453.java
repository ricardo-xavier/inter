package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador453")
public class Somador453 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
