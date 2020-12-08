package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador133")
public class Somador133 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
