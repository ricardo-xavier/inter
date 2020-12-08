package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador691")
public class Somador691 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
