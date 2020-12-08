package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador682")
public class Somador682 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
