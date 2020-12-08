package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador19")
public class Somador19 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
