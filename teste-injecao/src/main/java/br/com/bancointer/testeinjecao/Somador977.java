package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador977")
public class Somador977 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
