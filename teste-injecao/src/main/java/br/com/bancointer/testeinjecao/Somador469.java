package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador469")
public class Somador469 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
