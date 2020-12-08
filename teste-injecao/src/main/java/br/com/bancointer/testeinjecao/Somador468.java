package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador468")
public class Somador468 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
