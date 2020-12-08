package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador232")
public class Somador232 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
