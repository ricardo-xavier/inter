package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador954")
public class Somador954 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
