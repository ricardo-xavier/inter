package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador63")
public class Somador63 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
