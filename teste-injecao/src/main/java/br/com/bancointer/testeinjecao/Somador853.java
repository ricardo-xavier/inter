package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador853")
public class Somador853 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
