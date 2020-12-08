package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador361")
public class Somador361 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
