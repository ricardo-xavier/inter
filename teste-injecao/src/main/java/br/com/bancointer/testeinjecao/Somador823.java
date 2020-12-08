package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador823")
public class Somador823 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
