package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador617")
public class Somador617 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
