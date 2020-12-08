package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador48")
public class Somador48 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
