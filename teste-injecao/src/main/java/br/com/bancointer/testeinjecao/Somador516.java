package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador516")
public class Somador516 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
