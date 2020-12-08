package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador441")
public class Somador441 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
