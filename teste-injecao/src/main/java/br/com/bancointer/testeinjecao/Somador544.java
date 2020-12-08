package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador544")
public class Somador544 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
