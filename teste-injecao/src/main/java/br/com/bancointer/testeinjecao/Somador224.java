package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador224")
public class Somador224 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
