package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador547")
public class Somador547 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
